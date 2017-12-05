(ns user
  (:require [integrant.repl :refer [clear halt go init prep reset]]
            [duct.core :as duct]
            [clojure.java.io :as io]
            [integrant.repl.state :refer [config system]]))

(defn read-config []
  (duct/read-config (io/resource "config.edn")))

(integrant.repl/set-prep! (comp duct/prep read-config))
