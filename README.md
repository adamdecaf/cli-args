# cli-args

A simple command line arguments parser.

## Usage

```scala
    // Define a bunch of flags
    // Perfect chance to use HList's?
    val requiredFlags = ("-c" -> doSomething) :: ("-d" -> doSomethingElse) :: RequiredFlags
    val optionalFlags = ("-t" -> maybeSomething) :: ("-o" -> otherThing) :: OptionalFlags

    // Spruce them up
    val results = CLIParser.parse(args, requiredflags, optionalflags)

    if (results.nonSatisfied) {
        sys.exit(-1)
    }

    // Perhaps there's a nicer way of doing this..
    results match {
        case v @ Flag("-c") => // v contains the value given to the name "-c", but can be applied to run doSomething(v)
            v()

        case v @ Flag("-d") =>
            v()
    }

```

## TODO

* Multiple value (e.g. -i could be a param that takes in multiple input files) with a monoid
* Overwriting value (Use an accumulator or monad for this)
* Need a Validation class that can accumulate errors.
* Typed values (Handle casting of types with Validators)
