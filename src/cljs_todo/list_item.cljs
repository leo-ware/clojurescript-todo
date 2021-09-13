(ns cljs-todo.list-item)

(defn list-item [i name checked toggle delete]
  [:div
   {:style {:padding "0 20px"
            :height "40px"
            :width "300px"

            :display "flex"
            :flex-direction "row"
            :justify-content "space-between"
            :align-items "center"}}
   [:h5 {:style {:padding-right "10px"}} (+ 1 i)]
   [:p name]
   [:div {:style {:flex "1 0"}}]
   [:input {:type "checkbox"
            :checked checked
            :style {:height "15px"
                    :width "15px"
                    :margin-right "10px"}
            :onClick toggle}]
   [:h5 {:onClick delete} "X"]])
