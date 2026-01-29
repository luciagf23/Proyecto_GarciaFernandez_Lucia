package com.luciagf.view;

import java.util.ResourceBundle;

public enum FxmlView {
	USER {
		@Override
		public String getTitle() {
			return getStringFromResourceBundle("user.title");
		}

		@Override
		public String getFxmlFile() {
			return "/fxml/User.fxml";
		}
	},
	LOGIN {
		@Override
		public String getTitle() {
			return getStringFromResourceBundle("login.title");
		}

		@Override
		public String getFxmlFile() {
			return "/fxml/Login.fxml";
		}
<<<<<<< HEAD
	};
=======
	},
	
	INICIO {
		@Override
		public String getTitle() {
			return null;
		}

		@Override
		public String getFxmlFile() {
			return "/fxml/Inicio.fxml";
		}
	};

>>>>>>> branch 'main' of https://github.com/luciagf23/Proyecto_GarciaFernandez_Lucia.git

	public abstract String getTitle();

	public abstract String getFxmlFile();

	String getStringFromResourceBundle(String key) {
		return ResourceBundle.getBundle("Bundle").getString(key);
	}
}
