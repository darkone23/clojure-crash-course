(ns crash-course.core
  (:gen-class))

(defn square [n]
  (* n n))

(defn fib-seq
  "A lazy sequence representing the fibonacci sequence"
  ([seed step]
     (cons seed
           (lazy-seq (fib-seq step
                              (+ seed step)))))
  ([] (fib-seq 0N 1N)))

(defn fib [n]
  (if (< n 2) n
      (+ (fib (- n 1))
         (fib (- n 2)))))

(defn -main
  "Fibonacci party!"
  [n]
  (let [n (Integer/parseInt n)
        fibs (fib-seq)
        square-fibs (map square fibs)
        odd-fibs (filter odd? fibs)
        odd-square-fibs (filter odd? square-fibs)]
    (println "Have our complex sequences been realized?"
             (realized? odd-square-fibs))
    (println "The square of" n "is"
             (square n))
    (println "The fibonacci numbers up to " n "are"
             (take n fibs))
    (println "The squares of the first" n "fibonacci numbers are"
             (take n square-fibs))
    (println "The sum of the first" n "odd fibonacci squares is"
             (reduce + (take n odd-square-fibs)))))