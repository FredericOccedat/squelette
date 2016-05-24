# squelette

My typical starting point for a webapp:
- reloaded repl
- components
- httpkit as a webserver
- compojure for routing

## Usage

To create a new project from the skeleton, use the following sscript:

./create_project.sh <your_project_name>

It will create a new project based on the structure of squelette. It will only be a dumb webserver saying Hello. It will by default run on port 3000.

    $ lein uberjar
    $ java -jar target/uberjar/<your_project_name>.jar

or

    $ lein run

or

    In a repl, from the user namespace, first (dev) to load the dev environment, then (reset) to start the system.
    Use (reset) each time you want to reload the system. Use (stop) if you want to stop the system.

## License

Copyright © 2016 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
