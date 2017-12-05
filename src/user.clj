(ns user
  (:gen-class)
  (:require [integrant.repl :refer [clear halt go init prep reset]]
            [duct.core :as duct]
            [clojure.java.io :as io]
            [integrant.repl.state :refer [config system]]))

(defn read-config []
  (duct/read-config (io/resource "config.edn")))

(integrant.repl/set-prep! (comp duct/prep read-config))

(defn -main []
  (-> (read-config)
      (duct/prep)
      (duct/exec)))
