(ns squelette.system
  (:require [com.stuartsierra.component :as component]
            [squelette.components.web-server :refer [web-server]]
            [squelette.routes :refer [all-routes]]))

(defn new-system [options]
  (component/system-map :web-server (web-server all-routes options)))
