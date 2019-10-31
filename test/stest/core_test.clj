(ns stest.core-test
  (:require [clojure.test :refer :all]
            [stest.core :refer :all]))

(deftest a-test
  (testing "Successfull test"
    (is (= 1 1))))
