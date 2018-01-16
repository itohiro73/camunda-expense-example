package sample;

public enum Category {
    TRAVEL {
        @Override
        public String toString() {
            return "旅費交通費";
        }
    },
    MEAL {
        @Override
        public String toString() {
            return "接待交際費";
        }
    },
    EXPENDABLES {
        @Override
        public String toString() {
            return "消耗品";
        }
    },
    OTHER {
        @Override
        public String toString() {
            return "その他";
        }
    }
}
