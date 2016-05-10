(ns squelette.routes
  (:require [compojure.core :refer :all]
            [compojure.route :as route]))

(def all-routes
  (routes
   (GET "/" [] "<h1>Hello Squelette!</h1>")
   (route/not-found "<h1>Page not found</h1>")))
