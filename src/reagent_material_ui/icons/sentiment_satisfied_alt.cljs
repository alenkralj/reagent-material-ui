(ns reagent-material-ui.icons.sentiment-satisfied-alt
  "Imports @material-ui/icons/SentimentSatisfiedAlt as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def sentiment-satisfied-alt (create-svg-icon (e (.-Fragment js/React) nil (e "circle" #js {"cy" "9.5", "r" "1.5", "cx" "15.5"}) (e "circle" #js {"cy" "9.5", "r" "1.5", "cx" "8.5"}) (e "path" #js {"d" "M0 0h24v24H0V0z", "fill" "none"}) (e "circle" #js {"cy" "9.5", "r" "1.5", "cx" "15.5"}) (e "circle" #js {"cy" "9.5", "r" "1.5", "cx" "8.5"}) (e "path" #js {"d" "M11.99 2C6.47 2 2 6.48 2 12s4.47 10 9.99 10C17.52 22 22 17.52 22 12S17.52 2 11.99 2zM12 20c-4.42 0-8-3.58-8-8s3.58-8 8-8 8 3.58 8 8-3.58 8-8 8zm0-2.5c2.33 0 4.32-1.45 5.12-3.5h-1.67c-.69 1.19-1.97 2-3.45 2s-2.75-.81-3.45-2H6.88c.8 2.05 2.79 3.5 5.12 3.5z"}))
                                              "SentimentSatisfiedAlt"))