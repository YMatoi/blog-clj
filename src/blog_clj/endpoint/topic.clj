(ns blog-clj.endpoint.topic
  (:require [compojure.core :refer :all]
            [integrant.core :as ig]))

(defn topic-endpoint [options]
  (context "/topic" []
           (GET "/" [] "<b>TOPIC LIST</b>")
           (GET "/:id" [id] id)))

(defmethod ig/init-key
  :blog-clj.endpoint/topic [_ options]
  (topic-endpoint options))
