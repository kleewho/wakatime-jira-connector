(defproject wakatime-jira-connector "0.1.0-SNAPSHOT"
  :description "Downloads your activities from wakatime and reports times as worklog on jira"
  :url "https://github.com/kleewho/wakatime-jira-connector"
  :license {:name "Gnu General Public License"
            :url "https://www.gnu.org/licenses/gpl-3.0.en.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.stuartsierra/component "0.3.2"]
                 [com.atlassian.jira/jira-rest-java-client-core "4.0.0"]]
  :main ^:skip-aot wakatime-jira-connector.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
