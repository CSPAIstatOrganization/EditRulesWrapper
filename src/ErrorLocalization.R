#########
# START #
#########

# Get paths to IN and OUT files from the batch command line
paths <- commandArgs(trailingOnly = TRUE)
 # IN -> Error affected data 
 path.to.data.IN <- paths[1]
 # IN -> Edits
 path.to.edits.IN <- paths[2]
 # OUT -> Erroneous variables, to be subsequently imputed
 path.to.errors.OUT <- paths[3]

# Define the Driver
ErrorLocalization <- function(path.to.data.IN, path.to.edits.IN, path.to.errors.OUT){
##################################################################
# Driver function to editrules package function 'localizeErrors' #
##################################################################
# Load the editrules package
require(editrules)

# Read the (error-affected) data
data <- read.table(file= path.to.data.IN, header= TRUE, sep= ";", na.strings= NA,
                   quote="\"", dec= ".", strip.white= TRUE, comment.char= "")

# Read the edits
edit <- read.table(file= path.to.edits.IN, header= TRUE, sep= ";", na.strings= NA,
                   quote="\"", dec= ".", strip.white= TRUE, comment.char= "")

# Create edit matrix
m.edit <- editmatrix(edit)

# Localize errors
# Recall that the output may include some randomness, since solutions to the 
# error localization problem are non-unique in general...
errors <- localizeErrors(m.edit, data, verbose= TRUE, method= "mip")

# Start building output data according to CSPA poc requirements
errors.df <- as.data.frame(errors$adapt)

# Extract error-affected variables
varlist <- apply(errors.df, 1, function(x) names(errors.df)[x])

# Build variable names column
variable <- unlist(varlist) 

# Build ids (actually positions, to date) column
hits <- sapply(varlist, length)
pos <- rep(names(hits), hits)

# Build output dataframe
errors.out <- data.frame(ids = pos, variable = variable)

# Write out the errors
write.table(errors.out, file= path.to.errors.OUT, sep= ";", col.names= TRUE,
            row.names= FALSE, quote= FALSE, na= "NA")
}


# Invoke the Driver
ErrorLocalization(path.to.data.IN, path.to.edits.IN, path.to.errors.OUT)

#######
# END #
#######