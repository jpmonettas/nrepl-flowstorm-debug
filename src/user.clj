(ns user
  (:require [nrepl.server :as nrepl-server]
            [cider.nrepl :as cider-nrepl]))

(defn start-server [port]
  (nrepl-server/start-server :port port
                             :handler cider-nrepl/cider-nrepl-handler))
