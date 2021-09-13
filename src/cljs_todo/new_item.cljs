(ns cljs-todo.new-item
  (:require
   [reagent.core :as r]))

(defonce text (r/atom ""))

(defn new-item [add-item]
  [:div
   {:style {:padding "0 35px"
            :height "40px"
            :width "300px"

            :display "flex"
            :flex-direction "row"
            :justify-content "space-between"
            :align-items "center"}}
   [:input
    {:style {:border "none"
             :border-bottom "2px solid black"
             :font-size "medium"}
     :type "text"
     :placeholder "Add an item..."
     :value @text
     :on-change #(reset! text (-> % .-target .-value))}]
   [:h3
    {:style {:padding-right "13px"}
     :on-click #(when (seq @text)
                  (add-item @text)
                  (reset! text ""))}
    "+"]])
