(ns reagent-material-ui.icons.sports-cricket-sharp
  "Imports @material-ui/icons/SportsCricketSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def sports-cricket-sharp (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M15.05 12.81L6.56 4.32a.9959.9959 0 00-1.41 0L2.32 7.15c-.39.39-.39 1.02 0 1.41l8.49 8.49c.39.39 1.02.39 1.41 0l2.83-2.83c.39-.39.39-1.02 0-1.41zM14.3412 17.7562l1.4142-1.4142 4.2426 4.2426-1.4142 1.4142z"}) (e "circle" #js {"cy" "5.5", "r" "3.5", "cx" "18.5"}))
                                           "SportsCricketSharp"))
