(ns crash-course.core
  (:gen-class))

(defn square [n]
  (* n n))

(defn fib [n]
  (if (< n 2) n
      (+ (fib (- n 1))
         (fib (- n 2)))))

(defn -main
  "I don't do a whole lot ... yet."
  [n]
  (let [n (Integer/parseInt n)]
    (println "The square of" n "is" (square n))
    (println "The fibonacci number for" n "is" (fib n))))