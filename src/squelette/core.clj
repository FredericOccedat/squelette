(ns squelette.core
  (:require [com.stuartsierra.component :as component]
            [squelette.system :refer [new-system]])
  (:gen-class))

(defn -main
  "Starting point of the squelette app"
  [& args]
  (component/start (new-system {:port 3000})))
