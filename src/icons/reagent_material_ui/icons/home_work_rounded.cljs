(ns reagent-material-ui.icons.home-work-rounded
  "Imports @material-ui/icons/HomeWorkRounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def home-work-rounded (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M20 3h-8c-.55 0-1 .45-1 1v1.61l.01.01 5 4.5c.63.56.99 1.38.99 2.23V13h2v2h-2v2h2v2h-2v2h3c.55 0 1-.45 1-1V4c0-.55-.45-1-1-1zm-5 4h-2V5h2v2zm4 4h-2V9h2v2zm0-4h-2V5h2v2z"}) (e "path" #js {"d" "M15 20v-7.65c0-.28-.12-.55-.33-.74l-5-4.5c-.19-.18-.43-.26-.67-.26-.24 0-.48.09-.67.26l-5 4.5c-.21.18-.33.45-.33.74V20c0 .55.45 1 1 1h2c.55 0 1-.45 1-1v-4h4v4c0 .55.45 1 1 1h2c.55 0 1-.45 1-1z"}))
                                        "HomeWorkRounded"))
