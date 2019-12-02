# Playing with Microsoft BotBuilder in Scala

[![GitHub version](https://badge.fury.io/gh/mslinn%2FbotBuilderFun.svg)](https://badge.fury.io/gh/mslinn%2FbotBuilderFun)

See https://github.com/microsoft/botbuilder-java/

## Running the Program
The `bin/run` Bash script assembles this project into a fat jar and runs it.
Sample usage, which runs the `BBFun` entry point in `src/main/scala/Hello.scala`:

```
$ bin/run 
```

The `-j` option forces a rebuild of the fat jar. 
Use it after modifying the source code.

```
$ bin/run -j 
```
