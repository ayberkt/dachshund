(defproject dachshund "0.1.0-SNAPSHOT"
  :description "Draw Picasso's dachschund as a sequence of nine bezier curves."
  :url "https://github.com/ayberkt/dachshund"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [quil "2.1.0"]]
  :main ^:skip-aot dachshund.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
