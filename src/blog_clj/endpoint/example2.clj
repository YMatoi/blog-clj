(ns blog-clj.endpoint.example2
  (:require [compojure.core :refer :all]
            [integrant.core :as ig]))

(defn example-endpoint2 [options]
  (context "/example2" []
           (GET "/" [] "<b>Hello, world</b>")))

(defmethod ig/init-key 
  :blog-clj.endpoint/example2 [_ options]
  (example-endpoint2 options))
