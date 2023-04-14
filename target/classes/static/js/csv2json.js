//importing file system module from node
const fs = require('fs');
const csvToJson = require('csvtojson');

//importing the path module form node to work with file and directory paths
//this module provides utilities to work with file and directory paths
const path = require('path');

const directoryPath = '../us-car-models-data';

//returns an array of all files in the directory
const files = fs.readdirSync(directoryPath);

//console.log(files);

for (const file of files) {
    if (path.extname(file) === '.csv') {
        //Creating the file path
        const csvFilePath = path.join(directoryPath, file);
        // csvToJson().fromFile(csvFilePath).then((jsonObj) => { console.log(jsonObj); })
        csvToJson().fromFile(csvFilePath).then((jsonObj) => {
            const jsonDirectory = '../json';
            const jsonFilePath = path.join(jsonDirectory, path.basename(file, '.csv') + '.json');

            fs.writeFile(jsonFilePath, JSON.stringify(jsonObj), (err) => {
                if (err) { console.log(err) }
                else { console.log("File written successfully\n"); }
            })
        })

        //break;
    }
}

