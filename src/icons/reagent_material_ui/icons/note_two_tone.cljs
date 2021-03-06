(ns reagent-material-ui.icons.note-two-tone
  "Imports @material-ui/icons/NoteTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def note-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M15 6H4v12.01h16V11h-5z", "opacity" ".3"}) (e "path" #js {"d" "M4 4c-1.1 0-2 .9-2 2v12.01c0 1.1.9 1.99 2 1.99h16c1.1 0 2-.9 2-2v-8l-6-6H4zm16 14.01H4V6h11v5h5v7.01z"}))
                                    "NoteTwoTone"))
