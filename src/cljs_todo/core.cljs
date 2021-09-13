(ns cljs-todo.core
  (:require
   [reagent.dom :as d]
   [cljs-todo.app :as app]))

(defn mount-root []
  (d/render [app/app] (.getElementById js/document "app")))

(defn ^:export init! []
  (mount-root))
