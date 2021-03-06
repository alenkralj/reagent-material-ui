(ns reagent-material-ui.icons.unfold-more-two-tone
  "Imports @material-ui/icons/UnfoldMoreTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def unfold-more-two-tone (create-svg-icon (e "path" #js {"d" "M12 5.83L15.17 9l1.41-1.41L12 3 7.41 7.59 8.83 9 12 5.83zm0 12.34L8.83 15l-1.41 1.41L12 21l4.59-4.59L15.17 15 12 18.17z"})
                                           "UnfoldMoreTwoTone"))
