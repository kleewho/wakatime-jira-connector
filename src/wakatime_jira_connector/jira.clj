(ns wakatime-jira-connector.jira
  (:require [com.stuartsierra.component :as component]))


(defrecord Jira [url port]

  component/Lifecycle
  (start [this]
    (assoc this :jira nil))

  (stop [this]
    (assoc this :jira nil)))

(defn new-jira
  []
  {:jira (component/using (map->Jira {})
                          [:schema-provider])})
