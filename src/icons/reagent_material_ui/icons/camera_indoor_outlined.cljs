(ns reagent-material-ui.icons.camera-indoor-outlined
  "Imports @material-ui/icons/CameraIndoorOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def camera-indoor-outlined (create-svg-icon (e "path" #js {"d" "M14 13v-1c0-.55-.45-1-1-1H9c-.55 0-1 .45-1 1v4c0 .55.45 1 1 1h4c.55 0 1-.45 1-1v-1l2 1.06v-4.12L14 13zm-2-7.5l6 4.5v9H6v-9l6-4.5M12 3L4 9v12h16V9l-8-6z"})
                                             "CameraIndoorOutlined"))