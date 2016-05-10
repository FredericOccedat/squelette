# squelette

My typical starting point for a webapp:
- reloaded repl
- components
- httpkit as a webserver
- compojure for routing

## Usage

It's a just a dumb webserver saying Hello. It will by default run on port 3000.

    $ java -jar target/uberjar/squelette.jar

or

    $ lein run

or

    In a repl, from the user namespace, first (dev) to load the dev environment, then (reset) to start the system.
    Use (reset) each time you want to reload the system. Use (stop) if you want to stop the system.

## License

Copyright © 2016 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
