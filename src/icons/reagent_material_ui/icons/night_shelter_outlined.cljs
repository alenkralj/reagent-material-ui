(ns reagent-material-ui.icons.night-shelter-outlined
  "Imports @material-ui/icons/NightShelterOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def night-shelter-outlined (create-svg-icon (e "path" #js {"d" "M12 5.5l6 4.5v9H6v-9l6-4.5M12 3L4 9v12h16V9l-8-6zm3 9h-3.5v3.5H8V11H7v7h1v-1.5h8V18h1v-4c0-1.1-.9-2-2-2zm-5.25.5c-.69 0-1.25.56-1.25 1.25S9.06 15 9.75 15 11 14.44 11 13.75s-.56-1.25-1.25-1.25z"})
                                             "NightShelterOutlined"))