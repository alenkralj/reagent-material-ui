(ns reagent-material-ui.icons.smart-screen-two-tone
  "Imports @material-ui/icons/SmartScreenTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def smart-screen-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M3 17h1V7H3v10zM20 7v10h1V7h-1z", "opacity" ".3"}) (e "path" #js {"d" "M14 11.25h-1.5v1.5H14v-1.5zm2.5 0H15v1.5h1.5v-1.5zm-5 0H10v1.5h1.5v-1.5zm-2.5 0H7.5v1.5H9v-1.5zM21 5H3c-1.1 0-2 .9-2 2v10c0 1.1.9 2 2 2h18c1.1 0 2-.9 2-2V7c0-1.1-.9-2-2-2zM4 17H3V7h1v10zm14 0H6V7h12v10zm3 0h-1V7h1v10z"}))
                                            "SmartScreenTwoTone"))