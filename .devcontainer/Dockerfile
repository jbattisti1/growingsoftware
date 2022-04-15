# See here for image contents: https://github.com/microsoft/vscode-dev-containers/tree/v0.231.6/containers/debian/.devcontainer/base.Dockerfile

# [Choice] Debian version (use bullseye on local arm64/Apple Silicon): bullseye, buster
ARG VARIANT="buster"
FROM mcr.microsoft.com/vscode/devcontainers/base:0-${VARIANT}

SHELL [ "/bin/bash", "-c" ]

# ** [Optional] Uncomment this section to install additional packages. **
# RUN apt-get update && export DEBIAN_FRONTEND=noninteractive \
#     && apt-get -y install --no-install-recommends <your-package-list-here>

ARG USERNAME=vscode

USER $USERNAME
RUN curl -s "https://get.sdkman.io" | bash \
    && mkdir -p ~/.sdkman/etc/ \
    && echo "sdkman_curl_connect_timeout=120" >> ~/.sdkman/etc/config \
    && echo "sdkman_curl_max_time=0" >> ~/.sdkman/etc/config \
    && chmod a+x "$HOME/.sdkman/bin/sdkman-init.sh" \
    && source "$HOME/.sdkman/bin/sdkman-init.sh" \
    && sdk install java 17.0.2-tem \
    && sdk install gradle \
