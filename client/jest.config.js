
module.exports = {
    transform : {
        '^.+\\.jsx?$' : 'babel-jest',
        '^.+\\.svg$' : 'jest-svg-transformer'
    },
    transformIgnorePatterns:[
            '^.+\\.css$'
    ]
}
