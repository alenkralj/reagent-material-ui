(ns reagent-material-ui.icons.format-color-text-two-tone
  "Imports @material-ui/icons/FormatColorTextTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def format-color-text-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M0 20h24v4H0z", "fillOpacity" ".36"}) (e "path" #js {"d" "M5.5 17h2.25l1.12-3h6.25l1.12 3h2.25L13 3h-2L5.5 17zm8.88-5H9.62L12 5.67 14.38 12z"}))
                                                 "FormatColorTextTwoTone"))
