(ns structured-data)

(defn do-a-thing [x]
  (let [two-x (+ x x)]
  (Math/pow two-x two-x))
  )

(defn spiff [v]

  (if (< (count v) 3) 0 (+ (get v 0) (get v 2)) )

  )

(defn cutify [v]
    (conj v "<3"))

(defn spiff-destructuring [v]
  (let [[x y z] v]
     (+ x z)
  )
)

(defn point [x y]
  [x y])

(defn rectangle [bottom-left top-right]
  [bottom-left top-right])

(defn width [rectangle]
(let [[[x1 y1] [x2 y2]] rectangle ]
  (Math/abs (- x1 x2))
  )
)

(defn height [rectangle]
(let [[[x1 y1] [x2 y2]] rectangle ]
  (Math/abs (- y1 y2))
  )
)

(defn square? [rectangle]
(let [[[x1 y1] [x2 y2]] rectangle ]
  (if (= (Math/abs (- x1 x2)) (Math/abs (- y1 y2))) true false)
)
  )

(defn area [rectangle]
(let [[[x1 y1] [x2 y2]] rectangle ]
   (* (Math/abs (- x1 x2)) (Math/abs (- y1 y2))) )
)

(defn contains-point? [rectangle point]
  (let [[[x1 y1] [x2 y2]] rectangle ]
    (if (and (<= x1 (get point 0) x2) (<= y1 (get point 1) y2)) true false)
    )
  )

(defn contains-rectangle? [outer inner]
  (if (and (contains-point? outer (get inner 0)) (contains-point? outer (get inner 1))) true false)
)

(defn title-length [book]
  (count (:title book))
  )


(defn author-count [book]
  (count (:authors book))
  )

(defn multiple-authors? [book]

  (if (<= (count (:authors book)) 1) false true)

  )

(defn add-author [book new-author]

  (assoc book :authors (conj (get book :authors ) new-author ))
  )

(defn alive? [author]
  (not (contains? author :death-year))
  )

(defn element-lengths [collection]
  (map count collection))

(defn second-elements [collection]
  (let [getsecond (fn [x] (get x 1))]
    (map getsecond collection))
  )

(defn titles [books]
  (map :title books)
  )

(defn monotonic? [a-seq]
   (or (apply >= a-seq) (apply <= a-seq)))

(defn stars [n]
  (apply str (repeat n "*"))
  )

(defn toggle [a-set, elem]
  (if (contains? a-set elem) (disj a-set elem) (conj a-set elem))
  )

(defn contains-duplicates? [a-seq]
  (if (= (count a-seq) (count (set a-seq) ) ) false true)
  )

(defn old-book->new-book [book]
  (assoc book :authors (set (:authors book)))
  )

(defn has-author? [book author]
  (contains? (:authors book) author)
  )

(defn authors [books]
(apply clojure.set/union (map :authors books))
  )

(defn all-author-names [books]
  (map :name (authors books))
  )

(defn author->string [author]
  (let [author-name (:name author)
        author-birthyear (:birth-year author)
        author-deathyear (:death-year author)]
    (if (:birth-year author) (str author-name " ("author-birthyear " - " author-deathyear) (str author-name)
    )
  )
  )

(defn authors->string [authors]
  :-)

(defn book->string [book]
  :-)

(defn books->string [books]
  :-)

(defn books-by-author [author books]
  :-)

(defn author-by-name [name authors]
  :-)

(defn living-authors [authors]
  :-)

(defn has-a-living-author? [book]
  :-)

(defn books-by-living-authors [books]
  :-)

; %________%
