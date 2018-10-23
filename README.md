# gradle-graalvm-example
[![Build Status](https://travis-ci.org/gregwhitaker/gradle-graalvm-example.svg?branch=master)](https://travis-ci.org/gregwhitaker/gradle-graalvm-example)

An example of building a Gradle Java project as a native image with [GraalVM](https://www.graalvm.org/).

This example creates a simple application that counts from 1 to the number specified as an argument.

## Running the Demo
Follow the steps below to build and run the demo.

1. Run the following command to build the application:

        ./gradlew clean nativeImage

2. Execute the newly built native image by running the following command:

        ./build/graal/count 10
        
    If successful, you will see the following in the terminal:
    
        $ ./build/graal/count 10
        1
        2
        3
        4
        5
        6
        7
        8
        9
        10

## Bugs and Feedback
For bugs, questions, and discussions please use the [Github Issues](https://github.com/gregwhitaker/gradle-graalvm-example/issues).

## License
MIT License

Copyright (c) 2018 Greg Whitaker

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.