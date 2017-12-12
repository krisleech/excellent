(ns excellent.core)

(import [org.jxls.util JxlsHelper])
(import [org.jxls.common Context])

(require '(clojure.java [io :as io]))

;; http://jxls.sourceforge.net/xls/object_collection_template.xls
(def io (io/input-stream "object_collection_template.xls"))
(def os (io/output-stream "out.xls"))

;; keys and values must be strings, they are formatted as per template.
(def employees [ { "name" "Kris" } { "name" "Karol" } ])

(def context (Context.))
(.putVar context "employees" employees)

(def helper (JxlsHelper/getInstance))

(defn go []
  (println "Generating Excel")
  (.processTemplate helper io os context))
