(ns example.server
	(:require [ring.adapter.jetty :as jetty]))

(defn handler [request]
	{:status 200}) ; Defaults to an empty body

(defn main [] 
	(jetty/run-jetty handler {:port 3000}))

