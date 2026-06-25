class Badge {
    public String print(Integer id, String name, String department) {
        String label =  name + " - ";

        if (department != null) {
            label += department.toUpperCase();
        } else {label += "OWNER";}

        String idLabel = "[" + id + "]" + " - ";
        if (id != null) {
            label = idLabel + label;
        }

        return label;
    }
}
