package POJO.request.resfullbooker;

public class Bookingrequest {




        private String additionalneeds;

        private Bookingdates bookingdates;

        private Boolean depositpaid;

        private String firstname;

        private String lastname;
        private Long totalprice;

        public String getAdditionalneeds() {
            return additionalneeds;
        }

        public void setAdditionalneeds(String additionalneeds) {
            this.additionalneeds = additionalneeds;
        }

        public Bookingdates getBookingdates() {
            return bookingdates;
        }

        public void setBookingdates(Bookingdates bookingdates) {
            this.bookingdates = bookingdates;
        }

        public Boolean getDepositpaid() {
            return depositpaid;
        }

        public void setDepositpaid(Boolean depositpaid) {
            this.depositpaid = depositpaid;
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public Long getTotalprice() {
            return totalprice;
        }

        public void setTotalprice(Long totalprice) {
            this.totalprice = totalprice;
        }

    }


