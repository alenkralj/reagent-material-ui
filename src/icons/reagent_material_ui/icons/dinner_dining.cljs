(ns reagent-material-ui.icons.dinner-dining
  "Imports @material-ui/icons/DinnerDining as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def dinner-dining (create-svg-icon (e "path" #js {"d" "M2 19h20l-2 2H4l-2-2zM5 6h1v1H5V6zm0-2h1v1H5V4zm4 0v1H7V4h2zm0 3H7V6h2v1zm-3 8.23c-.36.11-.69.28-1 .47V8h1v7.23zm-2 1.29c-.38.44-.68.93-.84 1.48h16.82c.01-.16.03-.33.03-.5 0-3.04-2.46-5.5-5.5-5.5-2.29 0-4.25 1.4-5.08 3.4-.59-.25-1.24-.4-1.93-.4-.17 0-.33.02-.5.04V8h2c1.03.06 1.9-.96 2-2h10V5H11c-.1-1.05-.97-1.97-2-2H3v1h1v1H3v1h1v1H3v1h1v8.52z"})
                                    "DinnerDining"))