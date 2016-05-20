

<div class="modal fade" id="detailsModal" tabindex="-1" role="dialog"
     aria-labelledby="detailsModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            </div>

            <div class="modal-body">
                <h5 id="contact-Id">Contact Id goes here</h5>
                <table class="table table-bordered">
                    <tr>
                        <th>First Name</th>
                        <td id="contact-firstName"></td>
                    </tr>
                    <tr>
                        <th>Last Name</th>
                        <td id="contact-lastName"></td>
                    </tr>
                    <tr>
                        <th>Company</th>
                        <td id="contact-company"></td>
                    </tr>
                    <tr>
                        <th>Phone</th>
                        <td id="contact-phone"></td>
                    </tr>
                    <tr>
                        <th>Email</th>
                        <td id="contact-email"></td>
                    </tr>
                </table>
            </div>

            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>

<div class="modal fade" id="editModal" tabindex="-1" role="dialog"
     aria-labelledby="detailsModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <p class="modal-title" id="detailsModalLabel">Edit Contact</p>
            </div>

            <div class="modal-body">
                <h5 id="contact-Id">Contact Id goes here</h5>
                <form class="form-horizontal" role="form">
                    <div class="form-group">
                        <label for="edit-first-name" class="col-md-4 control-label">First Name:</label>
                        <div class="col-md-8">
                            <input type="text" class="form-control" id="edit-first-name" placeholder="First Name"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="edit-last-name" class="col-md-4 control-label">Last Name:</label>
                        <div class="col-md-8">
                            <input type="text" class="form-control" id="edit-last-name" placeholder="Last Name"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="edit-company" class="col-md-4 control-label">Company:</label>
                        <div class="col-md-8">
                            <input type="text" class="form-control" id="edit-company" placeholder="Company"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="edit-phone" class="col-md-4 control-label">Phone:</label>
                        <div class="col-md-8">
                            <input type="text" class="form-control" id="edit-phone" placeholder="Phone"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="edit-email" class="col-md-4 control-label">Email:</label>
                        <div class="col-md-8">
                            <input type="text" class="form-control" id="edit-email" placeholder="Email"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="col-md-offset-4 col-md-8">
                            <button type="submit" id="edit-button" class="btn btn-success" data-dismiss="modal">Save Contact</button>
                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                            <input type="hidden" id="edit-contactId"/>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

