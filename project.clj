(defproject excellent "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.jxls/jxls "2.4.2"]
                 [org.jxls/jxls-poi "1.0.13" :exclusions [org.jxls/jxls]]]

  :main ^:skip-aot excellent.core)
