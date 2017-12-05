(ns blog-clj.endpoint.example
  (:require [compojure.core :refer :all]
            [integrant.core :as ig]))

(defn example-endpoint [options]
  (context "/example" []
           (GET "/" [] "<b>Hello, world!!</b>")))

(defmethod ig/init-key 
  :blog-clj.endpoint/example [_ options]
  (example-endpoint options))

