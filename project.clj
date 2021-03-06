(defproject squelette "0.1.0-SNAPSHOT"
  :description "My typical startup skeleton for a clojure project"
  :url "https://github.com/FredericOccedat/squelette"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.logging "0.3.1"]
                 [com.stuartsierra/component "0.3.1"]
                 [http-kit "2.1.19"]
                 [compojure "1.5.0"]]
  :main squelette.core
  :target-path "target/%s"
  :profiles {:dev {:source-paths ["dev"]
                   :dependencies [[org.clojure/tools.namespace "0.2.11"]
                                  [reloaded.repl "0.2.1"]]}
             :uberjar {:uberjar-name "squelette.jar"
                       :aot :all}}
  :repl-options {:init-ns user})
