(ns cljs-todo.core
  (:require
   [reagent.core :as r]
   [reagent.dom :as d]
   [cljs-todo.app :as app]))

(defn mount-root []
  (d/render [app/app] (.getElementById js/document "app")))

(defn ^:export init! []
  (mount-root))
