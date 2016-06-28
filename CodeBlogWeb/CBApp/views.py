import json
from django.http.response import HttpResponse


# Create your views here.
def get_config(request):
    if request.method == 'GET':
        client_type = request.GET.get('client_type', None)
        if client_type == 'android':
            context = {'init_image': request.get_host() + '/static/image/welcome.jpg'}
            return HttpResponse(json.dumps(context), content_type="application/json")
        return HttpResponse(client_type)
