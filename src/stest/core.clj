(ns stest.core
  (:require [orchestra.core :refer [defn-spec]]))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn-spec ok-fn  boolean? [x int?] true)
(defn-spec bad-fn boolean? [x int?] x)
