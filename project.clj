(defproject simpro-scene "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :resource-paths ["lib/protege.jar"
                   "lib/looks.jar"
                   "lib/unicode_panel.jar"
                   "plugins/ru.igis.omtab/OpenMapTab-5.2.jar"
                   "plugins/ru.igis.omtab/openmap.jar"
                   "plugins/clojuretab/ClojureTab-1.5git.jar"
                   "plugins/clojuretab/rete-5.3.0-SNAPSHOT.jar"]
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main simpro-scene.core)
