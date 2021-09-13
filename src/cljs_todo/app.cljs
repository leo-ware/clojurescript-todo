(ns cljs-todo.app
  (:require
   [reagent.core :as r]
   [cljs-todo.new-item :refer [new-item]]
   [cljs-todo.list-item :refer [list-item]]))

(defonce items (r/atom [["take out trash" false]
                        ["walk dog" false]]))

(defn toggle [n]
  (swap! items update-in [n 1] not))

(defn delete [n]
  (swap! items #(into (subvec %1 0 n) (subvec %1 (inc n)))))

(defn append [name]
  (swap! items conj [name false]))

(defn app []
  [:div
   [:h1 {:style {:margin-left "15px"}} "Todo List"]
   [new-item append]
   (for [[i [name checked]] (partition 2 (interleave (range) @items))]
     [list-item i name checked #(toggle i) #(delete i)])])
