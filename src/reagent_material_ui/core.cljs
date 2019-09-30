(ns reagent-material-ui.core
  "Imports all components from @material-ui/core as Reagent components.
   Original documentation is at https://material-ui.com/ ."
  (:refer-clojure :exclude [list])
  (:require [reagent.core :as r]
            [material-ui]
            [goog.object :as obj]))

(def app-bar (r/adapt-react-class (obj/get js/MaterialUI "AppBar")))
(def avatar (r/adapt-react-class (obj/get js/MaterialUI "Avatar")))
(def backdrop (r/adapt-react-class (obj/get js/MaterialUI "Backdrop")))
(def badge (r/adapt-react-class (obj/get js/MaterialUI "Badge")))
(def bottom-navigation (r/adapt-react-class (obj/get js/MaterialUI "BottomNavigation")))
(def bottom-navigation-action (r/adapt-react-class (obj/get js/MaterialUI "BottomNavigationAction")))
(def box (r/adapt-react-class (obj/get js/MaterialUI "Box")))
(def breadcrumbs (r/adapt-react-class (obj/get js/MaterialUI "Breadcrumbs")))
(def button (r/adapt-react-class (obj/get js/MaterialUI "Button")))
(def button-base (r/adapt-react-class (obj/get js/MaterialUI "ButtonBase")))
(def button-group (r/adapt-react-class (obj/get js/MaterialUI "ButtonGroup")))
(def card (r/adapt-react-class (obj/get js/MaterialUI "Card")))
(def card-action-area (r/adapt-react-class (obj/get js/MaterialUI "CardActionArea")))
(def card-actions (r/adapt-react-class (obj/get js/MaterialUI "CardActions")))
(def card-content (r/adapt-react-class (obj/get js/MaterialUI "CardContent")))
(def card-header (r/adapt-react-class (obj/get js/MaterialUI "CardHeader")))
(def card-media (r/adapt-react-class (obj/get js/MaterialUI "CardMedia")))
(def checkbox (r/adapt-react-class (obj/get js/MaterialUI "Checkbox")))
(def chip (r/adapt-react-class (obj/get js/MaterialUI "Chip")))
(def circular-progress (r/adapt-react-class (obj/get js/MaterialUI "CircularProgress")))
(def click-away-listener (r/adapt-react-class (obj/get js/MaterialUI "ClickAwayListener")))
(def collapse (r/adapt-react-class (obj/get js/MaterialUI "Collapse")))
(def container (r/adapt-react-class (obj/get js/MaterialUI "Container")))
(def css-baseline (r/adapt-react-class (obj/get js/MaterialUI "CssBaseline")))
(def dialog (r/adapt-react-class (obj/get js/MaterialUI "Dialog")))
(def dialog-actions (r/adapt-react-class (obj/get js/MaterialUI "DialogActions")))
(def dialog-content (r/adapt-react-class (obj/get js/MaterialUI "DialogContent")))
(def dialog-content-text (r/adapt-react-class (obj/get js/MaterialUI "DialogContentText")))
(def dialog-title (r/adapt-react-class (obj/get js/MaterialUI "DialogTitle")))
(def divider (r/adapt-react-class (obj/get js/MaterialUI "Divider")))
(def drawer (r/adapt-react-class (obj/get js/MaterialUI "Drawer")))
(def expansion-panel (r/adapt-react-class (obj/get js/MaterialUI "ExpansionPanel")))
(def expansion-panel-actions (r/adapt-react-class (obj/get js/MaterialUI "ExpansionPanelActions")))
(def expansion-panel-details (r/adapt-react-class (obj/get js/MaterialUI "ExpansionPanelDetails")))
(def expansion-panel-summary (r/adapt-react-class (obj/get js/MaterialUI "ExpansionPanelSummary")))
(def fab (r/adapt-react-class (obj/get js/MaterialUI "Fab")))
(def fade (r/adapt-react-class (obj/get js/MaterialUI "Fade")))
(def filled-input (r/adapt-react-class (obj/get js/MaterialUI "FilledInput")))
(def form-control (r/adapt-react-class (obj/get js/MaterialUI "FormControl")))
(def form-control-label (r/adapt-react-class (obj/get js/MaterialUI "FormControlLabel")))
(def form-group (r/adapt-react-class (obj/get js/MaterialUI "FormGroup")))
(def form-helper-text (r/adapt-react-class (obj/get js/MaterialUI "FormHelperText")))
(def form-label (r/adapt-react-class (obj/get js/MaterialUI "FormLabel")))
(def grid (r/adapt-react-class (obj/get js/MaterialUI "Grid")))
(def grid-list (r/adapt-react-class (obj/get js/MaterialUI "GridList")))
(def grid-list-tile (r/adapt-react-class (obj/get js/MaterialUI "GridListTile")))
(def grid-list-tile-bar (r/adapt-react-class (obj/get js/MaterialUI "GridListTileBar")))
(def grow (r/adapt-react-class (obj/get js/MaterialUI "Grow")))
(def hidden (r/adapt-react-class (obj/get js/MaterialUI "Hidden")))
(def icon (r/adapt-react-class (obj/get js/MaterialUI "Icon")))
(def icon-button (r/adapt-react-class (obj/get js/MaterialUI "IconButton")))
(def input (r/adapt-react-class (obj/get js/MaterialUI "Input")))
(def input-adornment (r/adapt-react-class (obj/get js/MaterialUI "InputAdornment")))
(def input-base (r/adapt-react-class (obj/get js/MaterialUI "InputBase")))
(def input-label (r/adapt-react-class (obj/get js/MaterialUI "InputLabel")))
(def linear-progress (r/adapt-react-class (obj/get js/MaterialUI "LinearProgress")))
(def link (r/adapt-react-class (obj/get js/MaterialUI "Link")))
(def list (r/adapt-react-class (obj/get js/MaterialUI "List")))
(def list-item (r/adapt-react-class (obj/get js/MaterialUI "ListItem")))
(def list-item-avatar (r/adapt-react-class (obj/get js/MaterialUI "ListItemAvatar")))
(def list-item-icon (r/adapt-react-class (obj/get js/MaterialUI "ListItemIcon")))
(def list-item-secondary-action (r/adapt-react-class (obj/get js/MaterialUI "ListItemSecondaryAction")))
(def list-item-text (r/adapt-react-class (obj/get js/MaterialUI "ListItemText")))
(def list-subheader (r/adapt-react-class (obj/get js/MaterialUI "ListSubheader")))
(def menu (r/adapt-react-class (obj/get js/MaterialUI "Menu")))
(def menu-item (r/adapt-react-class (obj/get js/MaterialUI "MenuItem")))
(def menu-list (r/adapt-react-class (obj/get js/MaterialUI "MenuList")))
(def mobile-stepper (r/adapt-react-class (obj/get js/MaterialUI "MobileStepper")))
(def modal (r/adapt-react-class (obj/get js/MaterialUI "Modal")))
(def native-select (r/adapt-react-class (obj/get js/MaterialUI "NativeSelect")))
(def no-ssr (r/adapt-react-class (obj/get js/MaterialUI "NoSsr")))
(def outlined-input (r/adapt-react-class (obj/get js/MaterialUI "OutlinedInput")))
(def paper (r/adapt-react-class (obj/get js/MaterialUI "Paper")))
(def popover (r/adapt-react-class (obj/get js/MaterialUI "Popover")))
(def popper (r/adapt-react-class (obj/get js/MaterialUI "Popper")))
(def portal (r/adapt-react-class (obj/get js/MaterialUI "Portal")))
(def radio (r/adapt-react-class (obj/get js/MaterialUI "Radio")))
(def radio-group (r/adapt-react-class (obj/get js/MaterialUI "RadioGroup")))
(def root-ref (r/adapt-react-class (obj/get js/MaterialUI "RootRef")))
(def select (r/adapt-react-class (obj/get js/MaterialUI "Select")))
(def slide (r/adapt-react-class (obj/get js/MaterialUI "Slide")))
(def slider (r/adapt-react-class (obj/get js/MaterialUI "Slider")))
(def snackbar (r/adapt-react-class (obj/get js/MaterialUI "Snackbar")))
(def snackbar-content (r/adapt-react-class (obj/get js/MaterialUI "SnackbarContent")))
(def step (r/adapt-react-class (obj/get js/MaterialUI "Step")))
(def step-button (r/adapt-react-class (obj/get js/MaterialUI "StepButton")))
(def step-connector (r/adapt-react-class (obj/get js/MaterialUI "StepConnector")))
(def step-content (r/adapt-react-class (obj/get js/MaterialUI "StepContent")))
(def step-icon (r/adapt-react-class (obj/get js/MaterialUI "StepIcon")))
(def step-label (r/adapt-react-class (obj/get js/MaterialUI "StepLabel")))
(def stepper (r/adapt-react-class (obj/get js/MaterialUI "Stepper")))
(def svg-icon (r/adapt-react-class (obj/get js/MaterialUI "SvgIcon")))
(def swipeable-drawer (r/adapt-react-class (obj/get js/MaterialUI "SwipeableDrawer")))
(def switch (r/adapt-react-class (obj/get js/MaterialUI "Switch")))
(def tab (r/adapt-react-class (obj/get js/MaterialUI "Tab")))
(def table (r/adapt-react-class (obj/get js/MaterialUI "Table")))
(def table-body (r/adapt-react-class (obj/get js/MaterialUI "TableBody")))
(def table-cell (r/adapt-react-class (obj/get js/MaterialUI "TableCell")))
(def table-footer (r/adapt-react-class (obj/get js/MaterialUI "TableFooter")))
(def table-head (r/adapt-react-class (obj/get js/MaterialUI "TableHead")))
(def table-pagination (r/adapt-react-class (obj/get js/MaterialUI "TablePagination")))
(def table-row (r/adapt-react-class (obj/get js/MaterialUI "TableRow")))
(def table-sort-label (r/adapt-react-class (obj/get js/MaterialUI "TableSortLabel")))
(def tabs (r/adapt-react-class (obj/get js/MaterialUI "Tabs")))
(def textarea-autosize (r/adapt-react-class (obj/get js/MaterialUI "TextareaAutosize")))
(def text-field (r/adapt-react-class (obj/get js/MaterialUI "TextField")))
(def toolbar (r/adapt-react-class (obj/get js/MaterialUI "Toolbar")))
(def tooltip (r/adapt-react-class (obj/get js/MaterialUI "Tooltip")))
(def typography (r/adapt-react-class (obj/get js/MaterialUI "Typography")))
(def zoom (r/adapt-react-class (obj/get js/MaterialUI "Zoom")))
