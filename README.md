# crash-course

This is the source code for a five minute lightning talk on clojure.

Clojure is known being a lisp with rich immutable data structures, lazy evaluation, and java interop

## clojure syntax 101

```clojure
;; clojure is built out of java and uses java primitives where possible!
user> (type 1)
;java.lang.Long
user> (type 1.0)
;java.lang.Double
user> (type 123456789987654321M)
;java.math.BigDecimal
user> (type \a)
;java.lang.Character

;; some ideas don't fit into java primitives, like immutable vectors, keywords or maps
user> (type [])
;clojure.lang.PersistentVector
user> (type :key)
;clojure.lang.Keyword
user> (type {:key "val"})
;clojure.lang.PersistentArrayMap

;; functions!
user> (type (fn [] 1)) ;this inline function takes no parameters and always returns 1
;user$eval$fn
user> (1 + 1)
;ClassCastException java.lang.Long cannot be cast to clojure.lang.IFn
user> (+ 1 1) ; function goes first! prefix notation
;2
user> (let [a 2] (+ a a))
;4

;; java interop
user> (Math/pow 2 4) ;Math.pow(2, 4);
;16.0
user> (def now (java.util.Date.)) ;Date now = new java.util.Date();
;#user/now
user> (.getTime now) ;now.getTime();
;1344469316749
```

## Using this project

```bash
$ git clone https://github.com/eggsby/clojure-crash-course
$ cd clojure-crash-course && git checkout one
# browse code....
$ java -jar target/one.jar
$ git checkout two
# browse code...
$ java -jar target/two.jar 23
$ git checkout three
# browse code...
$ java -jar target/three.jar 33
```
